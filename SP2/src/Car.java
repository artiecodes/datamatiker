public abstract class Car {
    String licensePlate;
    String make;
    String model;
    int year;
    int numberOfDoors;

    Car (String licensePlate, String make, String model, int year, int numberOfDoors) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public double calculateGreenTax(Car car) {
        double greenTax = 0;
        double emissionTax = 0;
        int particleEmissionTax = 0;

        if (car instanceof PetrolCar) {
            if (((PetrolCar) car).consumption >= 20 && ((PetrolCar)car).consumption <= 50) {
                greenTax = 330;
            }

            if (((PetrolCar) car).consumption >= 15 && ((PetrolCar)car).consumption <= 20) {
                greenTax = 1050;
            }
            if (((PetrolCar) car).consumption >= 10 && ((PetrolCar)car).consumption <= 15) {
                greenTax = 2340;
            }
            if (((PetrolCar) car).consumption >= 5 && ((PetrolCar)car).consumption <= 10) {
                greenTax = 5500;
            }
            if (((PetrolCar) car).consumption < 5) {
                greenTax = 10470;
            }

            System.out.println("This is a petrol car.");
            System.out.println("Its consumption in KM/L is : "+ ((PetrolCar) car).consumption);
            System.out.println("The taxes amount to : " + greenTax + " DKK");
        }

        if (car instanceof ElectricCar) {
            double WhToL = ((ElectricCar) car).whPrKm / 91.25;
            double kmL = 100 / WhToL;

            if (kmL >= 20 && kmL <= 50) {
                greenTax = 330;
            }
            if (kmL >= 15 && kmL <= 20) {
                greenTax = 1050;
            }
            if (kmL >= 10 && kmL <= 15) {
                greenTax = 2340;
            }
            if (kmL >= 5 && kmL <= 10) {
                greenTax = 5500;
            }
            if (kmL < 5) {
                greenTax = 10470;
            }

            System.out.println("This is an electric car.");
            System.out.println("Its consumption in WhPrKM is : "+ ((ElectricCar) car).whPrKm);
            System.out.println("The taxes amount to : " +greenTax+ " DKK");
        }

        if (car instanceof DieselCar)
        {
            if (((DieselCar) car).consumption >= 20 && ((DieselCar) car).consumption <= 50) {
                greenTax = 330;
                emissionTax = 130;

                greenTax += particleEmissionTax;
            }
            if (((DieselCar) car).consumption >= 15 && ((DieselCar) car).consumption <= 20) {
                greenTax = 1050;
                emissionTax = 1390;

                greenTax += particleEmissionTax;
            }
            if (((DieselCar) car).consumption >= 10 && ((DieselCar) car).consumption <= 15) {
                greenTax = 2340;
                emissionTax = 1850;

                greenTax += particleEmissionTax;
            }
            if (((DieselCar) car).consumption >= 5 && ((DieselCar) car).consumption <= 10) {
                greenTax = 5500;
                emissionTax = 2770;

                greenTax += particleEmissionTax;
            }
            if (((DieselCar) car).consumption < 5) {
                greenTax = 10470;
                emissionTax = 15260;

                greenTax += emissionTax;
            }
            System.out.println("This is a diesel car.");
            System.out.println("Its consumption in KM/L is : "+ ((DieselCar) car).consumption);
            if(!((DieselCar) car).hasParticleFilter)
            {
                particleEmissionTax = 1000;
                greenTax += particleEmissionTax;
            }
            System.out.println("Particle emission tax : " + particleEmissionTax);
            System.out.println("The taxes amount to : " + (emissionTax + particleEmissionTax + greenTax) + " DKK");
        }

        return greenTax;
    }
}


    public class Cars extends vehicle {
        private int currentGear;
        private int wheels;
        private String type;
        private int doors;
        private int gear;
        private boolean isManual;

        private int seats;

        Cars(String name, int wheels, String type, int doors, int gear, boolean isManual, int seats) {
            // To call the constructor of parent class in child class we use super()
            super(name);

            this.wheels = wheels;
            this.type = type;
            this.doors = doors;
            this.gear = gear;
            this.isManual = isManual;
            this.currentGear = 1;
            this.seats = seats;
        }

        public int getWheels() {
            return wheels;
        }

        public String getType() {
            return type;
        }

        public int getDoors() {
            return doors;
        }

        public int getGear() {
            return gear;
        }

        public boolean isManual() {
            return isManual;
        }

        public int getSeats() {
            return seats;
        }

        public void setCurrentGear(int currentGear) {
            this.currentGear = currentGear;
        }

        public void setWheels(int wheels) {
            this.wheels = wheels;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setSeats(int seats) {
            this.seats = seats;
        }

        public void setManual(boolean manual) {
            isManual = manual;
        }

        public void setGear(int gear) {
            this.gear = gear;
        }

        public void setDoors(int doors) {
            this.doors = doors;
        }

        public void changeGear(int newGear) {
            this.currentGear += newGear;
            System.out.println("changeGear method called-current gear changed to: "+ currentGear);
        }

        public void changeSpeed(int newSpeed, int newDirection) {
            //To call the method of parent class in child class we use super.methodname()
            super.move(newSpeed, newDirection);
            System.out.println("changeSpeed method called-the speed is changed to: "+ newSpeed +"direction is changed to: "+ newDirection);

        }

    }




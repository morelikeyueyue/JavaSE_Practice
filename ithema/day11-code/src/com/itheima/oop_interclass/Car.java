package com.itheima.oop_interclass;

public class Car {
    private String carName;
    private int carAge;
    private String carColor;

    public Car() {
    }

    public Car(String carName, int carAge, String carColor) {
        this.carName = carName;
        this.carAge = carAge;
        this.carColor = carColor;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    public void show(String engineName, int engineAge) {
        Engine e = new Engine(engineName, engineAge);
        System.out.println(e.getEngineAge());
        e.show();
    }
    class Engine{
        private String engineName;

        private int engineAge;

        public Engine() {
        }

        public Engine(String engineName, int engineAge) {
            this.engineName = engineName;
            this.engineAge = engineAge;
        }

        public String getEngineName() {
            return engineName;
        }

        public void setEngineName(String engineName) {
            this.engineName = engineName;
        }

        public int getEngineAge() {
            return engineAge;
        }

        public void setEngineAge(int engineAge) {
            this.engineAge = engineAge;
        }

        public void show(){
            System.out.println(this.engineName+", "+this.engineAge);
            System.out.println(carName+", "+carAge+", "+carColor);
        }
    }
}

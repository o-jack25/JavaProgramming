public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year){
        //calling method below
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }
    Car(Car x){
        this.copy(x);
    }

    //use getter to send private vars to whatever class is calling that method

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    //takes a car object as an argument
    //have to copy the attributes from car1 to car2
    //can use this keyword
    public void copy(Car x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
    //now we have to get the values of car x ( values of car x)

}




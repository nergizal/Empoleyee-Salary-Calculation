public class Employe {
    public String name;
    public double salary;
    public int workHours,hireYear; //bu değerleri conscructordan alıcaz,dışardan değiştirmicez sonra.
    //conscructor yapıcı metot:
    Employe(int hireYear, int workHours, double salary, String name){
        this.name=name;// bu classın içindeki name'i parantex içindeki name'e eşitlicez)
        this.salary=salary;
        this.workHours=workHours;
        this.salary=salary;
    }
public double tax(){
    if(this.salary>=1000){
        return salary*0.03;
    } return 0.0;

}
public double bonus(){
    int extraHours=this.workHours-40;
    if(extraHours>0){
        return 30* extraHours;
    }
    return 0.0;
}
public double increase(){
    int year=2020-this.hireYear;
    if(year<10){
        return salary*0.5;
    }else if (year>=10&& year<20){
        return salary*0.10;
    }else{
        return salary*0.15;
    }
}
}

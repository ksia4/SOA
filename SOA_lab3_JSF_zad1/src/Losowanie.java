import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "Losowanie")
@RequestScoped

public class Losowanie {
    static int losuj = (int)(Math.random() * 5 + 1);
    static int one = 0, two = 0, three = 0, four = 0, five = 0;

    public int getLosuj(){
        return losuj;
    }

    public void setLosuj(int los){
        losuj = los;
    }

    public int getOne(){
        return one;
    }

    public void setOne(int one){
        this.one = one;
    }

    public int getTwo(){
        return two;
    }

    public void setTwo(int two){
        this.two = two;
    }

    public int getThree(){
        return three;
    }

    public void setThree(int three){
        this.three = three;
    }

    public int getFour(){
        return four;
    }

    public void setFour(int four){
        this.four = four;
    }

    public int getFive(){
        return five;
    }

    public void setFive(int five){
        this.five = five;
    }

    public String check1(){
        if (losuj == 1){
            losuj = (int)(Math.random() * 5 + 1);
            return "trafiony";
        }
        else{
            ++one;
            return "1";
        }
    }

    public String check2(){
        if (losuj == 2){
            losuj = (int)(Math.random() * 5 + 1);
            return "trafiony";
        }
        else{
            ++two;
            return "2";
        }
    }

    public String check3(){
        if (losuj == 3){
            losuj = (int)(Math.random() * 5 + 1);
            return "trafiony";
        }
        else{
            ++three;
            return "3";
        }
    }

    public String check4(){
        if (losuj == 4){
            losuj = (int)(Math.random() * 5 + 1);
            return "trafiony";
        }
        else{
            ++four;
            return "4";
        }
    }

    public String check5(){
        if (losuj == 5){
            losuj = (int)(Math.random() * 5 + 1);
            return "trafiony";
        }
        else{
            ++five;
            return "5";
        }
    }

}

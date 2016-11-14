import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class GameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameScreen extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("bgm game.wav");
    NumberModel nm= new NumberModel();

    public GameScreen()
    {    
        super(1100, 600, 1); 
        //GreenfootImage image = getBackground();
        //image.scale(1100, 600);
        backgroundMusic.playLoop();

        ArrayList<Integer> list = new ArrayList<Integer>();
        int num[]= new int[12];
        for (int i=1; i<100; i++) 
        {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i=0; i<12; i++) 
        {
            // System.out.println(list.get(i));
            num[i]= list.get(i);
        }

        prepare(num);
        nm.set_Numbers(num);

    }

    public void prepare(int num[])
    {

        Ball2 first = new Ball2();
        addObject(first,65,245);
        first.setLocation(65,255);
        String n0=Integer.toString(num[0]);
        addObject(new Label(n0), 65, 254);
        PlasticCup plasticcup = new PlasticCup(nm);
        addObject(plasticcup,65,247);       
        plasticcup.setLocation(65,247);

        Ball3 second = new Ball3();
        addObject(second,155,252);
        second.setLocation(155,254);
        String n1=Integer.toString(num[1]);
        addObject(new Label(n1), 155, 254);
        PlasticCup plasticcup2 = new PlasticCup(nm);
        addObject(plasticcup2,155,247);
        plasticcup2.setLocation(155,247);

        Ball5 third = new Ball5();
        addObject(third,245,247);
        third.setLocation(245,254);
        String n2=Integer.toString(num[2]);
        addObject(new Label(n2), 245, 254);
        PlasticCup plasticcup3 = new PlasticCup(nm);
        addObject(plasticcup3,245,247);
        plasticcup3.setLocation(245,247);

        Ball10 fourth = new Ball10();
        addObject(fourth,335,253);
        fourth.setLocation(335,254);   
        String n3=Integer.toString(num[3]);
        addObject(new Label(n3), 335, 254);
        PlasticCup plasticcup4 = new PlasticCup(nm);
        addObject(plasticcup4,335,247);
        plasticcup4.setLocation(335,247);

        Ball12 fifth = new Ball12();
        addObject(fifth,425,253);
        fifth.setLocation(425,254);
        String n4=Integer.toString(num[4]);
        addObject(new Label(n4), 425, 254);
        PlasticCup plasticcup5 = new PlasticCup(nm);
        addObject(plasticcup5,425,247);
        plasticcup5.setLocation(425,247);

        Ball17 sixth = new Ball17();
        addObject(sixth,515,248);
        sixth.setLocation(515,254);        
        String n5=Integer.toString(num[5]);
        addObject(new Label(n5), 515, 254);        
        PlasticCup plasticcup6 = new PlasticCup(nm);
        addObject(plasticcup6,515,247);
        plasticcup6.setLocation(515,247);

        Ball19 seventh = new Ball19();
        addObject(seventh,605,256);
        seventh.setLocation(605,254);
        String n6=Integer.toString(num[6]);
        addObject(new Label(n6), 605, 254);
        PlasticCup plasticcup7 = new PlasticCup(nm);
        addObject(plasticcup7,605,247);
        plasticcup7.setLocation(605,247);

        Ball21 eight = new Ball21();
        addObject(eight,695,260);
        eight.setLocation(695,254);
        String n7=Integer.toString(num[7]);
        addObject(new Label(n7), 695, 254);
        PlasticCup plasticcup8 = new PlasticCup(nm);
        addObject(plasticcup8,695,247);
        plasticcup8.setLocation(695,247);

        Ball4 ninth = new Ball4();
        addObject(ninth, 785, 260);
        ninth.setLocation(785, 254);
        String n8=Integer.toString(num[8]);
        addObject(new Label(n8), 785, 254);
        PlasticCup plasticcup9 = new PlasticCup(nm);
        addObject(plasticcup9,785,247);
        plasticcup9.setLocation(785,247);

        Ball6 tenth = new Ball6();
        addObject(tenth, 875, 260);
        tenth.setLocation(875, 254);
        String n9=Integer.toString(num[9]);
        addObject(new Label(n9), 875, 254);
        PlasticCup plasticcup10 = new PlasticCup(nm);
        addObject(plasticcup10,875,247);
        plasticcup10.setLocation(875,247);

        Ball15 eleventh = new Ball15();
        addObject(eleventh, 965, 260);
        eleventh.setLocation(965, 254);
        String n10=Integer.toString(num[10]);
        addObject(new Label(n10), 965, 254);
        PlasticCup plasticcup11 = new PlasticCup(nm);
        addObject(plasticcup11,965,247);
        plasticcup11.setLocation(965,247);

        Ball7 twelth = new Ball7();
        addObject(twelth, 1055, 260);
        twelth.setLocation(1055, 254);
        String n11=Integer.toString(num[11]);
        addObject(new Label(n11), 1055, 254);
        PlasticCup plasticcup12 = new PlasticCup(nm);
        addObject(plasticcup12,1055,247);
        plasticcup12.setLocation(1055,247);

        Ball19 to_search = new Ball19();
        addObject(to_search,550,54);

        // Just to display number at top ball 
        int random_num=(int) (Math.random() * 12);
        String op= Integer.toString(num[random_num]);
        addObject(new Label(op), 550, 54);


        Message message = new Message();
        addObject(message,361,431);
    }
}
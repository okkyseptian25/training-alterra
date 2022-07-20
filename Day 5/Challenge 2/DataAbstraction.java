import java.util.*;
import java.io.IOException;

class CLS {
    public void Main() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}

abstract class TemplateCalculator{
    public abstract void tempMessage(String message);
    public Integer selectedControl;

    public void header(){
        System.out.println("++++++++++++++++++++ CALCULATOR ++++++++++++++++++++");
    }

    public void bottom(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void middle(){
        System.out.println("--------------------------------------------------");
    }
}

class CalcControl extends TemplateCalculator{
    @Override
    public void tempMessage(String message){
        System.out.println(message);
    }

    public Integer getSelectedControl(){
        return this.selectedControl;
    }

    public void setSelectedControl(Integer sc){
        this.selectedControl = sc;
    }

    public void interfaceControl(){
        this.header();
        this.tempMessage("1: Open Calculator");
        this.tempMessage("99: Exit");
        this.middle();
        System.out.print("Masukkan Pilihan anda: ");
    }
}

class OperationControl extends TemplateCalculator{

    @Override
    public void tempMessage(String message){
        System.out.println(message);
    }

    public Integer getSelectedOPControl(){
        return this.selectedControl;
    }

    public void setSelectedOPControl(Integer sp){
        this.selectedControl = sp;
    }

    public void interfaceControl(){
        this.header();
        this.tempMessage("Please Enter Calculation Operation:");
        this.tempMessage("1: Add Value");
        this.tempMessage("2: Sub Value");
        this.tempMessage("3: Multiply Value");
        this.tempMessage("4: Divide Value");
        this.tempMessage("99: Exit");
        this.middle();
        System.out.print("Pilihan Anda: ");
    }
}

class ValueControl extends TemplateCalculator{
    private Integer value1;
    private Integer value2;
    private Float result;

    @Override
    public void tempMessage(String message){
        System.out.println(message);
    }

    public Integer getVal1(){
        return this.value1;
    }

    public void setVal1(Integer v){
        this.value1 = v;
    }

    public Integer getVal2(){
        return this.value2;
    }

    public void setVal2(Integer v){
        this.value2 = v;
    }

    public Float getVal3(){
        return this.result;
    }

    public void setVal3(Float v){
        this.result = v;
    }

    public void interfaceControlVal1(){
        this.header();
        System.out.print("Value 1: ");
    }

    public void interfaceControlVal2(){
        System.out.print("Value 2: ");
    }

    public Float operationMath(Integer selectedControl){
        switch(selectedControl){
            case 1: // ADD
                Float addition = (float) (this.getVal1() + this.getVal2());
                this.setVal3(addition);
                break;
            case 2: // SUBSTRACT
                Float substraction = (float) (this.getVal1() - this.getVal2());
                this.setVal3(substraction);
                break;
            case 3: // MULTIPLY
                Float multi = (float) (this.getVal1() * this.getVal2());
                this.setVal3(multi);
                break;
            case 4: // DIVISION
                Float division = (float) (this.getVal1() / this.getVal2());
                this.setVal3(division);
                break;
            default:
                Float zero = (float) 0;
                this.setVal3(zero);

        }
        return this.getVal3();
    }
}

public class DataAbstraction {
    public static void main(String[] args){
        CalcControl cc = new CalcControl();
        CLS cls = new CLS();
        cc.interfaceControl();

        Scanner scannerControl = new Scanner(System.in);
        Integer pilihanControl = scannerControl.nextInt();

        cc.setSelectedControl(pilihanControl);
        cc.bottom();

        if(cc.getSelectedControl() == 1){
            try {
                cls.Main();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            OperationControl oc = new OperationControl();
            oc.interfaceControl();

            pilihanControl = scannerControl.nextInt();

            oc.setSelectedOPControl(pilihanControl);
            oc.bottom();

            if(oc.getSelectedOPControl() != 99){
                try {
                    cls.Main();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                ValueControl vc = new ValueControl();

                vc.interfaceControlVal1();
                Integer v1 = scannerControl.nextInt();
                vc.setVal1(v1);
                vc.interfaceControlVal2();
                Integer v2 = scannerControl.nextInt();
                vc.setVal2(v2);
                vc.middle();
                
                Float hasil = vc.operationMath(oc.getSelectedOPControl());
                System.out.println("Hasil: " + hasil);
                vc.bottom();
            }else{
                scannerControl.close();
                return;
            }

            scannerControl.close();
        }else{
            scannerControl.close();
            try {
                cls.Main();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return;
        }
    }
}
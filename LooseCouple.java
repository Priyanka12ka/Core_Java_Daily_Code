public class LooseCouple {
    public static void main(String[] args) {
        value v=null;
        v=new Add();
        v.setvalue(2, 3);
        PerformOperation p=new PerformOperation();
        p.AschMethod(v);
        v=new Mul();
        v.setvalue(3,4);
        p.AschMethod(v);  
    }
    
}
class value{
    int i;
    int j;
    void setvalue(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
    int getResult(){
        return 0;
    }

}
class Mul extends value{
    int getResult()
    {
        return i*j;
    }

}
class Add extends value{
    int getResult()
    {
        return i+j;
    }

}
class PerformOperation{
    void AschMethod(value v)
    {
        int result=v.getResult();
        System.out.println("Result ---->"+result);
    }
}
public class TightCouple {
    public static void main(String[] args) {
        Mul m=new Mul();
        m.setvalue(2, 3);
        PerformOperation p=new PerformOperation();
        p.AschMethod(m);

        
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
    void AschMethod(Mul m)
    {
        int result=m.getResult();
        System.out.println("Result ---->"+result);
    }
}
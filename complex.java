public class complex{
    int real;
    int imaginary;
    complex(int real,int imaginary){
          this.real=real;
          this.imaginary=imaginary;
    }
    public static complex sum(complex c1,complex c2){
          complex temp=new complex(0,0);
          temp.real=c1.real+c2.real;
          temp.imaginary=c1.imaginary+c2.imaginary;
          return temp;
    }
    public static void main(String[]args){
          complex first=new complex(3,2);
          complex second=new complex(1,7);
          complex result=sum(first,second);
          System.out.println("sum:"+result.real+"+"+result.imaginary+"i");
    }
}


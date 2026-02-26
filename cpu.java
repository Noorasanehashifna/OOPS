class cpu{
    int price;
    public cpu(int p){
       this.price=p;
    }
    void display(){
       System.out.println("price of cpu:"+this.price);
    }
    class processor{
       int cores;
       String manufacture;
       processor(int core, String manf){
           this.cores=core;
           this.manufacture=manf;
       }
       void display(){
           System.out.println("No of cores:"+this.cores);
       }
    }
    static class Ram{
       int memory;
       String manufacture;
       Ram(int n,String m){
           this.memory=n;
           this.manufacture=m;
       }
       void display(){
          System.out.println("memory size:"+this.memory);
          System.out.println("memory manufacture:"+this.manufacture);
       }
    }
    public static void main(String[]args){
        cpu intel=new cpu(23000);
        cpu.processor p=intel.new processor(8,"intel");
        cpu.Ram ram=new cpu.Ram(64,"asus");
        intel.display();
        p.display();
        ram.display();
   }
   
}

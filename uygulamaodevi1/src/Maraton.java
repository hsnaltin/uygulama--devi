public class Maraton {
    private final String[] name;
    private final int[] time;
    public Maraton(int[] time, String[] name){
        this.time=time;
        this.name=name;
    }
    public void sıra(){
        System.out.println("Birinci: "+name[getFirst()]+" "+time[getFirst()]);
        System.out.println("İkinci: "+name[getSecond()]+" "+time[getSecond()]);
        System.out.println("Üçüncü: "+name[getThird()]+" "+time[getThird()]);
    }
    public int getFirst(){
        int birinci=0, first=time[0]*10;
        for(int i=0;i< time.length;i++){
            if(time[i]<first){
                first=time[i];
                birinci=i;
            }
        }
        return birinci;
    }
    public int getSecond(){
        int ikinci=0,second=time[0]*10;
        for (int i=0;i< time.length;i++){
            if(time[i]<second){
                if(i!=getFirst()){
                    second=time[i];
                    ikinci=i;
                }
            }

        }
        return ikinci;
    }
    public int getThird(){
        int üçüncü=0, third=time[0]*10;
        for (int i=0;i< time.length;i++){
            if(time[i]<third){
                if (i!=getFirst()&&i!=getSecond()){
                    third=time[i];
                    üçüncü=i;
                }
            }
        }
        return üçüncü;
    }
    public void veri(){
        int a=0,b=0,c=0;
        for (int times:time){
            if (times>=200 && times<=299){
                a++;
            } else if (times>=300 && times<=399) {
                b++;

            }
            else{
                c++;
            }
        }
        System.out.println("A->"+a);
        System.out.println("B->"+b);
        System.out.println("C->"+c);
    }














}

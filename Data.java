import java.util.*;
import java.io.*;
public class Data implements Comparable<Data> {
    private String load_data;
    private String areas;
    private String content;

    public Data(String data){
    	load_data = data;
    }

    public String getTime() {
        return (load_data.split(" ",2))[0];
    }

    public String getAreas(){
        return (load_data.split(" ",2))[1];
    }

    public String toString(){
        return getTime()+" "+getAreas();
    }

    @Override
    public int compareTo(Data o) {
        if (o.getTime().equals(this.getTime())){
            return 0;
	}
	int[] temp_o = new int[3];
	int[] temp_t = new int[3];
	temp_o[0] = Integer.valueOf(((o.getTime()).split("_",3))[0]);
	temp_o[1] = Integer.valueOf(((o.getTime()).split("_",3))[1]);
	temp_o[2] = Integer.valueOf(((o.getTime()).split("_",3))[2]);
	temp_t[0] = Integer.valueOf(((this.getTime()).split("_",3))[0]);
	temp_t[1] = Integer.valueOf(((this.getTime()).split("_",3))[1]);
	temp_t[2] = Integer.valueOf(((this.getTime()).split("_",3))[2]);
	if (temp_o[0]==temp_t[0]){
	    if (temp_o[1]==temp_t[1]){
	        return temp_t[2]-temp_o[2];
	    }
	    return temp_t[1]-temp_o[1];
	}
	return temp_t[0]-temp_o[0];
    }
}

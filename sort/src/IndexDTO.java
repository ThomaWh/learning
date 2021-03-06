import java.io.Serializable;

/**
 * @Author: xqq
 * @Date: 2019/6/6
 * @Description:
 */
public class IndexDTO implements Serializable {

    private String num1;
    private Integer num2;
    private String num3;
    private String num4;
    private Integer num5;



    public IndexDTO(){}

    public IndexDTO(String num1, Integer num2, String num3, String num4, Integer num5) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    public String getNum4() {
        return num4;
    }

    public void setNum4(String num4) {
        this.num4 = num4;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public String getNum3() {
        return num3;
    }

    public void setNum3(String num3) {
        this.num3 = num3;
    }

    public Integer getNum5() {
        return num5;
    }

    public void setNum5(Integer num5) {
        this.num5 = num5;
    }

    @Override
    public String toString() {
        return "IndexDTO{" +
                "num1='" + num1 + '\'' +
                ", num2=" + num2 +
                ", num3='" + num3 + '\'' +
                ", num4='" + num4 + '\'' +
                ", num5=" + num5 +
                '}';
    }
}

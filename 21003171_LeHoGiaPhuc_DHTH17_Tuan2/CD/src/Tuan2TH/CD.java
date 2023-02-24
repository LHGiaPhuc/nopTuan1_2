package tuan2;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class tuan2 {
//Khai bao bien
private String maCD;
private String tuanCD;
private Calendar ngayPH;
private double dongia;
private int soBH;
//Dong goi
public String getMaCD() {
return maCD;
}
public void setMaCD(String ma) throws Exception{
if(ma!="") {
this.maCD=ma;
}else throw new Exception("Loi ma");
}
public String getTuanCD() {
return tuanCD;
}
public void setTuanCD(String tua) throws Exception{
if(tua!="") {
this.tuanCD=tua;
}else throw new Exception("Loi");
}
public Calendar getNgayPH() {
return ngayPH;
}
public void setNgayPH(Calendar ngayPH) throws Exception{
if(ngayPH!=null) {
this.ngayPH=ngayPH;
}else throw new Exception("Loi ngay");
}
public double getDonGia() {
return dongia;
}
public void setDonGia(double dongia) {
this.dongia=dongia;
}
public int getSoBH() {
return soBH;
}
public void setSoBH(int soBH) {
this.soBH=soBH;
}
//Tao ham de khoi tao doi tuong
public tuan2() {
this.maCD="00000000";
this.tuanCD="xxxxxxxx";
this.ngayPH=null;
this.soBH=0;
this.dongia=10000;
}
public tuan2(String ma, String tua, Calendar ngayPH, double dongia, int so) throws Exception{
if(ma!="") {
this.maCD=ma;
}else throw new Exception("Loi ma");
if(tua!="") {
this.tuanCD=tua;
}else throw new Exception("Loi");
if(ngayPH!=null) {
this.ngayPH=ngayPH;
}else throw new Exception("Loi ngay");
this.dongia=dongia;
if(so>0) {
this.soBH = so;
}else throw new Exception ("Loi so");
}
//Phuong thuc tinh getThanhTien()
public double getThanhTien() {
return getDonGia()*getSoBH();
}
public void tieuDe() {
System.out.println("Test ket qua");
for(int i=0; i<72; i++)
System.out.printf("-");
System.out.println();
System.out.printf("|%-10s|%-10s|%-14s|%-10s|%-10s|%-12s|\n", "Ma CD","Tua CD", "Ngay phat hanh","don gia", "so bai hat", "tong tien");
for(int i=0;i<71;i++)
System.out.printf("-");
System.out.println();
}
Locale lc=new Locale("vi","VN");
DateFormat df= DateFormat.getDateInstance(1, lc);
NumberFormat sf= NumberFormat.getCurrencyInstance(lc);
@Override
public String toString() {
String s="";
s+=String.format("|%-10s|%-10s|%14s|%10s|%10s|%12s|",getMaCD(),getTuanCD(),df.format(getNgayPH().getTime()),sf.format(getDonGia()),getSoBH(),sf.format(getThanhTien()));
return s;
}

}
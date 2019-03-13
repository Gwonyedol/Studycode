package kr.or.bit;

import javax.swing.text.StyledEditorKit.BoldAction;

/*
요구사항정의
Tv는 채널정보를 가지고 있다(예를 들면 1~250채널)
Tv는 브랜드 이름을 가지고 있다(예를 들면 삼성 ,엘지)
Tv는 채널 전환 기능을 가지고 있다(채널을 변경할수 있다 한단계씩)
기능 2개 (++  , --)
Tv는 전원정보를 가지고 있다 
Tv의 전원은 On 할수 도 있고 Off 할수도 있다 
*/
public class Tv {
   public int ch; //public int ch=1;
   public String brandname;
   
   //public int power;
   public boolean power;  //true (on) , false(off)
   
   
   public void ch_up() {
	   //member field 상태 값
	   ch++;
   }
   public void ch_down() {
	   ch--;  
   }
   
   public void power_on() {
	   power = true; //
   }
   
   public void power_off() {
	   power = false;
   }
   
}

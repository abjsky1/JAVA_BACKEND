package day017_260729_JAVA;

public class JAVA_exam1 {

    public static void main(String[] args) {
        

        // [1] 자동 타입 변환 : byte => short => short => int => long => float => double

            byte    bytevalue   = 100;          // byte 타입에 bytevalue 변수명으로 100 리터럴을 대입했다.
            short   shortvalue  = bytevalue;    // [가능]  byte  -> short   [자료유지, 타입변경]
            int     intvalue    = shortvalue;   // [가능]  short -> int     [자료유지, 타입변경]
            long    longvalue   = intvalue;     // [가능]  int   -> long    [자료유지, 타입변경]
            float   floatvalue  = longvalue;    // [가능]  long  -> float   [자료유지, 타입변경]
            double  doublevalue = floatvalue;   // [가능]  float -> double  [자료유지, 타입변경]
            
            System.out.println(doublevalue);

            // 연산 중에 자동 타입 변환
            // byte or short 연산결과 = int
            byte b1 = 10; short s1 = 20; int i1 = 30; long l1 = 40L; float f1 = 50; double d1 = 60;  
            int result1 = b1 + b1; // int
            int result2 = b1 + s1;
            int result3 = s1 + s1;
            int result4 = s1 + i1;
            int result5 = i1 + i1;
            long result6 = i1 + l1;
            float result7 = l1 + f1;
            double result8 = f1 + d1;



        // [2] 강제 타입 변환 : byte <= short <= short <= int <= long <= float <= double
        
            double  d2  =  3.14; 
        //  float   f2  =  d2;          ===>> d2 에 빨간줄 뜸. 에러발생
            float   f2  =  (float)d2;   // 자료 앞에 변환할 타입명 명시하여 강제로 타입 변환
        //  long    l2  =  f2;          ===>> f2 에 빨간줄 뜸. 에러발생
            long    l2  =  (long)f2;    // 자료 앞에 변환할 타입명 명시하여 강제로 타입 변환  ,  [ 3.14 -> 3 ] 손실발생
        //  int     i2  =  l2;          ===>> l2 에 빨간줄 뜸. 에러발생
            int     i2  =  (int)l2;     // 자료 앞에 변환할 타입명 명시하여 강제로 타입 변환
        //  short   s2  =  i2;          ===>> i2 에 빨간줄 뜸. 에러발생
            short   s2  =  (short)i2;   // 자료 앞에 변환할 타입명 명시하여 강제로 타입 변환
        //  byte    b2  =  s2;          ===>> s2 에 빨간줄 뜸. 에러발생
            byte    b2  =  (byte)s2;    // 자료 앞에 변환할 타입명 명시하여 강제로 타입 변환

            System.out.println(b2);


    }
}

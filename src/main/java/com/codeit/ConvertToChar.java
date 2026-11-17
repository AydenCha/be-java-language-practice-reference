package com.codeit;

public class ConvertToChar {
    public char convertToChar(int num) {
        char result;
        // TODO: 여기에 코드를 작성합니다.
        // 문자 '0'~'9'는 번호가 차례로 붙어 있어서, '0'에 num을 더하면 num에 해당하는 숫자 문자가 됩니다.
        // char와 int를 더하면 int가 되므로 (char)로 다시 바꿉니다.
        result = (char) ('0' + num);
        //하단의 코드는 수정하지 말아야 합니다.
        return result;
    }
}

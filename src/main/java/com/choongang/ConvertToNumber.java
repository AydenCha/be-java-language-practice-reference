package com.choongang;

public class ConvertToNumber {
    public int convertToNumber(char character) {
        int result;
        // TODO: 여기에 코드를 작성합니다.
        // 문자 '0'~'9'는 번호가 차례로 붙어 있어서, 문자에서 '0'을 빼면 0~9의 숫자가 나옵니다.
        // (int) character만 쓰면 '9'의 유니코드 값인 57이 나옵니다.
        result = character - '0';
        //하단의 코드는 수정하지 말아야 합니다.
        return result;
    }
}

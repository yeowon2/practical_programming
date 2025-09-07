package com.prac.practical_programming.chapter02.sc2_1;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode
@RequiredArgsConstructor
public class Color {
    public final int r;
    public final int g;
    public final int b;

    // RGB 값에 해당하는 Hex 문자열을 반환하는 메서드
    public String toHex() {
        // int 값을 16진수로 바꾸는 포맷 사용
        // %02x는 숫자를 최소 2자리의 16진수로 출력하는 형식 지정자
        return String.format("#%02x%02x%02x", r, g, b);
    }
}

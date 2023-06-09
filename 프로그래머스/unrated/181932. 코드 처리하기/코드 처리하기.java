class Solution {
    public String solution(String code) {
        int mode = 0; // 초기 mode는 0 (짝수 인덱스 처리)
        StringBuilder ret = new StringBuilder(); // 결과 문자열
        
        for (int idx = 0; idx < code.length(); idx++) {
            if (mode == 0) { // mode가 0인 경우
                if (code.charAt(idx) != '1') {
                    if (idx % 2 == 0) {
                        ret.append(code.charAt(idx));
                    }
                } else {
                    mode = 1; // mode를 0에서 1로 변경
                }
            } else { // mode가 1인 경우
                if (code.charAt(idx) != '1') {
                    if (idx % 2 != 0) {
                        ret.append(code.charAt(idx));
                    }
                } else {
                    mode = 0; // mode를 1에서 0으로 변경
                }
            }
        }
        
        // ret가 비어있는 경우 "EMPTY" 반환
        if (ret.length() == 0) {
            return "EMPTY";
        } else {
            return ret.toString();
        }
    }
}

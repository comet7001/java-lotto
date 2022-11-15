package statements;

public enum ErrorStatements {
    SHOUT_NOT_NUMBER_ERROR("[ERROR] 숫자가 아닌 입력값이 있습니다. 1~45사이의 숫자를 입력해주세요."),
    SHOUT_NUMBER_RANGE_ERROR("[ERROR] 범위를 넘어선 숫자입니다. 1~45사이의 숫자를 입력해주세요."),
    SHOUT_INVALID_FORMAT_ERROR("[ERROR] 유효하지 않은 형식입니다. 형식에 맞는 값을 입력해주세요."),
    SHOUT_INVALID_LENGTH_ERROR("[ERROR] 유효하지 않은 입력입니다. 길이에 맞는 값을 입력해주세요."),
    SHOUT_PAYMENT_UNIT_ERROR("[ERROR] 가격 단위가 부적절합니다. 1000원 단위로 입력해주세요.");

    private final String warning;
    private ErrorStatements(String warning){
        this.warning=warning;
    }

    public String alarmed(){
        return warning;
    }

}

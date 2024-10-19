package calculator.domain.message;

public enum ErrorMessage implements MessageProvider {

    INVALID_INPUT("입력이 비어 있습니다."),
    POSITIVE_INPUT_REQUIRED("정수형이 아니거나 계산 범위를 초과하였습니다."),
    INVALID_CUSTOM_DELIMITER("커스텀 구분자 형식이 잘못되었습니다."),
    INTEGER_IN_DELIMITER("커스텀 구분자에 정수형이 포함될 수 없습니다."),
    ;

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

package javaCore.t4t1t8;

import java.io.IOException;

public class MyNewException extends IOException {

    //�������� ����� � ���������� �����
    public void testExp() throws MyNewException {
        throw new MyNewException();
    }

}



package Model.Exceptions;

import java.io.IOException;

public class NoLogicalDatesException extends IOException {

    public NoLogicalDatesException(String info)
    {
        super(info);
        System.out.println("You have to check dates!");
    }
}

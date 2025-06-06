package db.Exception;

public class DBIntegrityException extends RuntimeException {
    public DBIntegrityException(String message) {
        super(message);
    }
}

package antlr;

/* ANTLR Translator Generator
 * Project led by Terence Parr at http://www.jGuru.com
 * Software rights: http://www.antlr.org/RIGHTS.html
 *
 * $Id: RecognitionException.java,v 1.1 2003/06/04 20:54:22 greg Exp $
 */

public class RecognitionException extends ANTLRException {
    public String fileName;		// not used by treeparsers
    public int line;				// not used by treeparsers
    public int column;			// not used by treeparsers

    public RecognitionException() {
        super("parsing error");
        fileName = null;
        line = -1;
        column = -1;
    }

    /**
     * RecognitionException constructor comment.
     * @param s java.lang.String
     */
    public RecognitionException(String s) {
        super(s);
        fileName = null;
        line = -1;
        column = -1;
    }

    /** @deprecated As of ANTLR 2.7.2 use {@see #RecognitionException(char, String, int, int) } */
    public RecognitionException(String s, String fileName_, int line_) {
        this(s, fileName_, line_, -1);
    }
    
    /**
     * RecognitionException constructor comment.
     * @param s java.lang.String
     */
    public RecognitionException(String s, String fileName_, int line_, int column_) {
        super(s);
        fileName = fileName_;
        line = line_;
        column = column_;
    }

    public String getFilename() {
        return fileName;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    /** @deprecated As of ANTLR 2.7.0 */
    public String getErrorMessage() {
        return getMessage();
    }

    public String toString() {
        return FileLineFormatter.getFormatter().
            getFormatString(fileName, line, column) + getMessage();
    }
}

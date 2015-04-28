package com.effective.code.item2;

/**
 * Created by GURDIT_SINGH on 28-04-2015.
 */
public class TextDelimited {

    private final Fields fields;
    private final String delimiter;
    private final String quote;
    private boolean hasHeader;
    private boolean safe;
    private Object types[];

    public TextDelimited(builder builder) {
        this.fields=builder.fields;
        this.delimiter=builder.delimiter;
        this.quote=builder.quote;
        this.hasHeader=builder.hasHeader;
        this.safe=builder.safe;
        this.types=builder.types;
    }


    public Fields getFields() {
        return fields;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public String getQuote() {
        return quote;
    }

    public boolean isHasHeader() {
        return hasHeader;
    }

    public boolean isSafe() {
        return safe;
    }

    public Object[] getTypes() {
        return types;
    }

    public static class builder{

        private  Fields fields=null;
        private String delimiter=",";
        private String quote="";
        private boolean hasHeader=false;
        private boolean safe=false;
        private Object types[]=null;

        public builder(Fields fields,String delimiter){
            this.fields=fields;
            this.delimiter=delimiter;
        }

        public builder quote(String quote){
            this.quote=quote;
            return this;
        }

        public builder types(Object types[]){
            this.types=types;
            return this;
        }
        public builder header(boolean hasHeader){
            this.hasHeader=hasHeader;
            return this;
        }

        public builder safe(boolean safe){
            this.safe=safe;
            return this;
        }

        public TextDelimited build(){
            return new TextDelimited(this);
        }

    }
}

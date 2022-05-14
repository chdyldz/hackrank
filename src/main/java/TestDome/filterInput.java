package TestDome;



    public class UserInput {

        public static class TextInput {

            public String inputValue;

            public void add(char c){
                inputValue=inputValue+c;
            }

            public String getValue(){
                return inputValue;
            }
        }

        public static class NumericInput extends TextInput{

            public String inputValue;
            @Override
            public void add(char c){
                String s=""+c;
                while(!s.matches("[0-9]+")){
                    inputValue=inputValue+c;
                }

            }
            @Override
            public String getValue(){
                return inputValue;
            }

        }

        public static void main(String[] args) {
            // TextInput input = new NumericInput();
            // input.add('1');
            // input.add('a');
            //input.add('0');
            // System.out.println(input.getValue());
        }
    }

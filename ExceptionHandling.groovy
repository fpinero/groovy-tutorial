class ExceptionHandling {
    static void main(String[] args){
        // ---------- EXCEPTION HANDLING ----------
        // Handles runtime errors

        try {
            File testFile;
            testFile.append('Line 5');
        }
        catch(NullPointerException ex){

            // Prints exception
            println("He cazado la excepción NullPointerException");
            println(ex.toString());

            // Prints error message
            println("\nImprimamos el mensaje de la excepción con ex.getMessage()");;
            println(ex.getMessage());
        }
        catch(Exception ex){
            println("I Catch Everything");
        }
        finally {
            println("\nfinally -> performs clean up")
        }
    }
}

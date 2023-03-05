
package ventanas;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AñadirBinario extends ObjectOutputStream{

    public AñadirBinario(OutputStream out) throws IOException {
        super(out);
    }

    public AñadirBinario() throws IOException, SecurityException {
    }
    
    @Override
    public void writeStreamHeader() throws IOException{
        File archivo = new File("registroAtletas.bin");
        
        if(archivo.length()==0){ //Si el archivo esta vacio
            super.writeStreamHeader();
        }
        else{
            reset();
        }
    }
}

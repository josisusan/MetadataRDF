/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metadatardf;

/**
 *
 * @author susan
 */
public class ImageFileUpload {
    private String pathName;
    public void fileUpload(String path){
        //add the code
        
        this.pathName = path;
    }
    
    public String getFilename(){
        return pathName;
    }
}

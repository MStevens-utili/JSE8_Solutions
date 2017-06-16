/**
 * Created by stevensm on 16/06/2017.
 */
import java.io.File;
import java.io.FileFilter;

public class C1_Solutions {

    //1.1
    public File[] subDirsWithFilter( File dir){

        return dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
    }

    //1.2
    public File[] subDirLambda( File dir){
        return dir.listFiles( f -> f.isDirectory());
    }

    //2
    public String[] extensionsInDir (File dir, String ext){

        return dir.list( (directory, name) -> name.endsWith(ext));
    }

    //3
    


}

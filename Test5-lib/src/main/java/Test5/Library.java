/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Test5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class Library {
	@Getter @Setter  private String id;
	private String location;
	
    public boolean someLibraryMethod() {
        return true;
    }
}

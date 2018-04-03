2. 
```
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestJunit {

	@Test
	public void testAnimalNameSetter() {
		Animal animal = new Animal();
		String newName = "dog";
		animal.setName(newName);
		
		if (animal.getName() != newName) {
			// the setter method is not working
			fail(animal.getName() + " does not equal " + newName);
		}
	}

}

```

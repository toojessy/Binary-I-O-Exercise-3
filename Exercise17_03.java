import java.io.*;

/**
 * Exercise 3: Track how many times a program has been executed
 */
public class Exercise17_03 {

    public static void main(String[] args) {

        File file = new File(System.getProperty("user.home"), "Exercise17_03.dat");
        int count = 0;

        // STEP 1: Read existing count if file exists
        // TODO: Check if file exists using file.exists()
        if (file.exists()) {

            // TODO: If file exists, open DataInputStream and read the count
            try (DataInputStream input =
                         new DataInputStream(new FileInputStream(file))) {
                count = input.readInt();

            } catch (IOException e) {
            }

            // TODO: Close the input stream (or use try-with-resources)
            // (Handled automatically)
        }

        // STEP 2: Increment the count
        // TODO: Add 1 to count
        count++;

        // STEP 3: Write updated count back to file
        // TODO: Create DataOutputStream for the file
        try (DataOutputStream output =
                     new DataOutputStream(new FileOutputStream(file))) {

            // TODO: Write the updated count
            output.writeInt(count);

            // TODO: Close the output stream (or use try-with-resources)
            // (Handled automatically)

        } catch (IOException e) {
        }

        // Display the result
        System.out.println("This program has been executed " + count + " time(s).");
    }
}

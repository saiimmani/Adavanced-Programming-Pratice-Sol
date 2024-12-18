#include <stdio.h>

int main(int argc, char *argv[]) {
    int i;

    // Print the program's name
    printf("\nYour program name is %s\n", argv[0]);

    // Print a message introducing the arguments
    printf("Your arguments are: \n");

    // Loop through all the arguments (excluding the first one, which is the program name)
    for(i = 1; i < argc; i++) {
        // Print each argument and its first character
        printf("\t%s starts with %c\n", argv[i], argv[i][0]);
    }

    return 0;
}

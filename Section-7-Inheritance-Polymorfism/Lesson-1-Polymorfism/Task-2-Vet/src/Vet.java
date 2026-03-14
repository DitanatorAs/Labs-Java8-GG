public class Vet {
    public int testAnimals(Animal[] animals) {
        int petCount = 0;

        for (Animal animal : animals) {
            if (animal instanceof Pet) {
                petCount++;
            }
        }

        return petCount;
    }
}
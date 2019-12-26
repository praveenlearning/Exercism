import java.util.Arrays;
class DnDCharacter {

    int ability() {
        int[] values = new int[]{1+(int)Math.random()*6,1+(int)Math.random()*6,1+(int)Math.random()*6,1+(int)Math.random()*6};
        Arrays.sort(values);
        return values[1]+values[2]+values[3];
    }

    int modifier(int input) {
        return (int)Math.floor((input-10.0)/2);
    }

    int getStrength() {
        return ability();
    }

    int getDexterity() {
        return ability();
    }

    int getConstitution() {
        return ability();
    }

    int getIntelligence() {
        return ability();
    }

    int getWisdom() {
        return ability();
    }

    int getCharisma() {
        return ability();
    }

    int getHitpoints() {
        return 10+modifier(getConstitution());
    }
}

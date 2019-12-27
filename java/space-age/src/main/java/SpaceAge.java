class SpaceAge {
    double seconds;
    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds/31557600;
    }

    double onMercury() {
        return seconds/(0.2408467*31557600);
    }

    double onVenus() {
        return seconds/(0.61519726*31557600);
    }

    double onMars() {
        return seconds/(1.8808158*31557600);
    }

    double onJupiter() {
        return seconds/(11.862615*31557600);
    }

    double onSaturn() {
        return seconds/(29.447498*31557600);
    }

    double onUranus() {
        return seconds/(84.016846*31557600);
    }

    double onNeptune() {
        return seconds/(164.79132*31557600);
    }

}

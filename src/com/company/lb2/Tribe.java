package com.company.lb2;

public class Tribe {
    private String name;
    private boolean fire;
    private int population;

    public Tribe() {
    }

    public Tribe(String name, boolean fire, int population) {
        this.name = name;
        this.fire = fire;
        this.population = population;
    }

    public Tribe(Tribe o) {
        this.name = o.name;
        this.fire = o.fire;
        this.population = o.population;
    }

    public Tribe(String Name, boolean Fire) {
        this.name = Name;
        this.fire = Fire;
    }

    public String getName() {
        return name;
    }

    public boolean isFire() {
        return fire;
    }

    public int getPopulation() {
        return population;
    }

    public static int Population(Tribe[] tribe) {
        int p = 0;
        for (int i = 0; i < 4; i++)
            p += tribe[i].population;
            return p;
        }
        public static int hasFire (Tribe[]tribe){
            int fir = 0;
            for (int i = 0; i < 4; i++)
                if (tribe[i].fire == true)
                    fir++;
            return fir;
        }
        public void print () {
            System.out.println(this.getName() + "\n" + this.getPopulation());
            if (this.isFire()) {
                System.out.println("Handle fire.");
            }
            if (!this.isFire()) {
                System.out.println("Not handle fire.");
            }
        }
    }

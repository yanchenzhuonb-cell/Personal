class Employee {
    String name;
    String email;
    int experience;
    public Employee(String name,String email,int experience){
    this.name=name;
    this.email=email;
    this.experience=experience;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public int getExperience(){
        return this.experience;
    }
}


class Developer extends Employee {
    String[] skills;
    String mainLanguage;
    public Developer(String name, String email, int experience, String type,String[] skills){
        super(name,email,experience);
        this.skills=skills;
        this.mainLanguage=type;
    }
    public String[] getSkills(){
        return this.skills;
    }
    public String getMainLanguage(){
        return this.mainLanguage;
    }
    // write fields

    // write constructor

    // write getters
}

class DataAnalyst extends Employee {
    boolean phd;
    String[] methods;
    public DataAnalyst(String name, String email, int experience, boolean phd,String[] methods){
        super(name,email,experience);
        this.methods=methods;
        this.phd=phd;
    }
    public boolean isPhd() {
    return phd;
}
    public String[] getMethods() {
        return methods;
    }
    // write fields

    // write constructor

    // write getters
}
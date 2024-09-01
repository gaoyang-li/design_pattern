package proxy_pattern.bad1;

/**
 * 被追求者
 */
public class Girl {
    private String name;

    public Girl(){

    }

    public Girl(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

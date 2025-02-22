package test;

import java.util.ArrayList;
import java.util.List;


public class Topic {
    public final String name;

    private List<Agent> pubs;
    private List <Agent> subs;



    Topic(String name){
        this.name=name;
        this.pubs=new ArrayList<>();
        this.subs=new ArrayList<>();
    }

    public void subscribe(Agent a){
    subs.add(a);

    }
    public void unsubscribe(Agent a){
    subs.remove(a);
    }

    public void publish(Message m){
        subs.parallelStream().forEach(a ->a.callback(name,m));
    }

    public void addPublisher(Agent a){
        pubs.add(a);
    }

    public void removePublisher(Agent a){
        pubs.remove(a);
    }


}

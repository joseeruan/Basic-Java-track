package edu.jose.set.basicOperations;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {

    private Set<Guest> guestSet;

    public GuestSet() {
        this.guestSet = new HashSet<>();
    }

    public void addGuest(String name, int invitationCode) {

        Guest guest = new Guest(name, invitationCode);

        guestSet.add(guest);
    }
    public void removeGuestByInvitationCode(int invitationCode) {

        if(!guestSet.isEmpty()) {
            for(Guest guest : guestSet) {
                if (guest.getInvitationCode() == invitationCode) {
                    guestSet.remove(guest);
                    break;
                }
            }
        }
    }
    public int countGuests() {
        return guestSet.size();
    }

    public void showGuests() {
        if(!guestSet.isEmpty()) {
            System.out.println(guestSet);
        }
        else {
            System.out.println("The set is empty.");
        }
    }

    public static void main(String[] args) {
        GuestSet guestset = new GuestSet();

        guestset.addGuest("Jose", 15);
        guestset.addGuest("Paulo", 10);
        guestset.addGuest("Fernanda", 10);

        System.out.println(guestset.countGuests());

        guestset.removeGuestByInvitationCode(15);
        guestset.showGuests();

        System.out.println(guestset.countGuests());
    }

}

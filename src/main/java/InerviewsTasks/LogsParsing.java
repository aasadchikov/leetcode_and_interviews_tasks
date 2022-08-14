package InerviewsTasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// A => B => C => ERROR

// A => C => B => no error
// C => B => A => no error
// A => B => B => C => no error

// Create a function that outputs all the users who experienced the error.

// Logs are in chronological order from when they occurred

public class LogsParsing {

    public static void main (String[] args) {
        System.out.println("Hello Java");
        //Format: {"Action:UserID", "Action:UserID", …}

        String[] logs = { "A:1",
                "A:1",
                "A:2",
                "A:3",
                "A:1",
                "B:1",
                "B:1",
                "B:2",
                "B:3",
                "A:3",
                "C:3",
                "C:2",
                "C:1",
                "B:1",
                "C:1"};

        findErrorsInUsersActions(logs);
    }


    public static void findErrorsInUsersActions(String[] logs) {

        //find all unique users
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for( String act : logs) {

            char currentUser = act.charAt(2);

            if (map.containsKey(currentUser)) {
                map.put(currentUser, map.get(currentUser) + 1);
            }
            else {
                map.put(currentUser, 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            //collecting actions of each user
            LinkedList<Character> actionsOfUser = new LinkedList<Character>();
            Character currentUser = entry.getKey();
            for (String act : logs) {

                char userID = act.charAt(2);

                if (userID == currentUser) {
                    actionsOfUser.add(act.charAt(0));
                }

            }

            String dataActionsOfUser = actionsOfUser.toString().replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\, ", "");

            //compare actions of users with example A => B => C
            Pattern pattern = Pattern.compile("A+B+C+");
            Matcher matcher = pattern.matcher(dataActionsOfUser);
            if (matcher.find()) {
                System.out.println("User ID:" + currentUser + " has Wrong actions!");
            }

        }


    }
}

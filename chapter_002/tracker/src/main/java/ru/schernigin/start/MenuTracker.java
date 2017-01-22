package ru.schernigin.start;

import ru.schernigin.models.Item;
import ru.schernigin.models.Comments;

import java.text.Format;

/**
 * Class MenuTracker.
 * author Schernigin
 * since 21.01.2017.
 * version 1.0
 */
public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[7];

    public MenuTracker(Tracker tracker, Input input){
        this.input = input;
        this.tracker = tracker;
    }

    public void fillActions(){
        this.actions[0] = new AddItem();
        this.actions[1] = new UpdateItem();
        this.actions[2] = new FindIdItem();
        this.actions[3] = new FindNameItem();
        this.actions[4] = new GetAllItem();
        this.actions[5] = new CommentItem();
        this.actions[6] = new DeleteItem();
    }

    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    public void showMenu() {
        for(UserAction action : actions) {
            if (action != null){
                System.out.println(action.info());
            }
        }
    }

    private class AddItem implements UserAction {
        public int key() {
            return 0;
        }

        public void execute(Input input, Tracker tracker){
            String name = input.ask("Please enter the item's name: ");
            String desc = input.ask("Please enter the item's description: ");
            tracker.add(new Item(name, desc));
        }

        public String info() {
            return String.format("%s %s", this.key(), "Add the new item");
        }
    }

    private class UpdateItem implements UserAction {
        public int key() {
            return 1;
        }

        public void execute(Input input, Tracker tracker){
            String id = input.ask("Please enter the item id : ");
            String name = input.ask("Please enter the item's name: ");
            String desc = input.ask("Please enter the item's description: ");
            Item item = new Item(name, desc);
            item.setId(id);
            tracker.update(item);
        }

        public String info() {
            return String.format("%s %s", this.key(), "update item");
        }
    }

    private class FindIdItem implements UserAction {
        public int key() {
            return 2;
        }

        public void execute(Input input, Tracker tracker){
            String id = input.ask("Please enter id item: ");
            tracker.findById(id);
        }

        public String info() {
            return String.format("%s %s", this.key(), "find an item by ID");
        }
    }

    private class FindNameItem implements UserAction {
        public int key() {
            return 3;
        }

        public void execute(Input input, Tracker tracker){
            String name = input.ask("Please enter name item: ");
            tracker.findByName(name);
        }

        public String info() {
            return String.format("%s %s", this.key(), "find an item by name");
        }

    }

    private class GetAllItem implements UserAction {
        public int key() {
            return 4;
        }

        public void execute(Input input, Tracker tracker){
            for (Item item : tracker.getAll()) {
                System.out.println(String.format("%s. %s", item.getId(), item.getName()));
            }
        }

        public String info() {
            return String.format("%s %s", this.key(), "show all item");
        }
    }

    private class CommentItem implements UserAction {
        public int key() {
            return 5;
        }

        public void execute(Input input, Tracker tracker){
            String id = input.ask("Please enter id item: ");
            String comment = input.ask("Please enter comment item: ");
          //  tracker.addComment(id, comment);
        }

        public String info() {
            return String.format("%s %s", this.key(), "add comment item");
        }
    }

    private class DeleteItem implements UserAction {
        public int key() {
            return 6;
        }

        public void execute(Input input, Tracker tracker){
            String id = input.ask("Please enter id item: ");
            tracker.delete(new Item());
        }

        public String info() {
            return String.format("%s %s", this.key(), "Delete item");
        }
    }
}

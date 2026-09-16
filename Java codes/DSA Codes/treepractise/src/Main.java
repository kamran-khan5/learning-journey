public class Main {
    public static void main(String[] args) {
        TreeNode drinks=new TreeNode("Drinks");
        TreeNode hot=new TreeNode("Hot");
        TreeNode cold=new TreeNode("Cold");
        TreeNode tea=new TreeNode("Drinks");
        TreeNode coffee=new TreeNode("Tea");
        TreeNode coke=new TreeNode("Coke");
        TreeNode pepsi=new TreeNode("Pepsi");
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(coke);
        cold.addChild(pepsi);
        System.out.println(drinks.print(0));
    }
}
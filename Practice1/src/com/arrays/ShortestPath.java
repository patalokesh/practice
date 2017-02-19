package com.arrays;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ShortestPath {
    public static int findShortestPath(int[][] area) {
        Field[][] fields = new Field[area.length][area[0].length];
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields[0].length; j++) {
                if (area[i][j] != 0) {
                    fields[i][j] = new Field(i, j, Integer.MAX_VALUE, null);
                }
            }
        }

        LinkedList<Field> q = new LinkedList<>();

        Field start = fields[0][0];
        start.dist = 0;
        q.add(start);

        Field dest = null;
        Field cur;
        while ((cur = q.poll()) != null) {
            if (area[cur.x][cur.y] == 3) {
                dest = cur;
            }
            visitNeighbour(fields, q, cur.x - 1, cur.y, cur);
            visitNeighbour(fields, q, cur.x + 1, cur.y, cur);
            visitNeighbour(fields, q, cur.x, cur.y - 1, cur);
            visitNeighbour(fields, q, cur.x, cur.y + 1, cur);
        }

        if (dest == null) {
            return -1;
        } else {
            LinkedList<Field> path = new LinkedList<>();
            cur = dest;
            do {
                path.addFirst(cur);
            } while ((cur = cur.prev) != null);

            return path.size();
        }
    }

    private static void visitNeighbour(Field[][] fields, LinkedList<Field> q, int x, int y, Field parent) {
        int dist = parent.dist + 1;
        if (x < 0 || x >= fields.length || y < 0 || y >= fields[0].length || fields[x][y] == null) {
            return;
        }
        Field cur = fields[x][y];
        if (dist < cur.dist) {
            cur.dist = dist;
            cur.prev = parent;
            q.add(cur);
        }
    }

    private static class Field implements Comparable<Field> {
        public int x;
        public int y;
        public int dist;
        public Field prev;

        private Field(int x, int y, int dist, Field prev) {
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.prev = prev;
        }

        @Override
        public int compareTo(Field o) {
            return dist - o.dist;
        }
    }

    public static void main(String[] args) {
        int[][] area = new int[][] {
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 1, 1},
                {1, 1, 1, 3, 1, 1},
                {0, 0, 0, 0, 0, 0}
        };
        System.out.println(findShortestPath(area));
        
    }
}
import { Category } from './category';
import { Question } from './question';
import { Admin } from './admin';
import { Topic } from './topic';

export class Game {

     id:string;
     name:string;
     category:Category;
     playcount:number;
      questions:Question[];
     admin:Admin;
     topic:Topic;
     level:string;
}

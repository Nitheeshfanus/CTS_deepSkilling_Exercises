import React, { Component } from "react";
import Post from "./Post";

class Posts extends Component {

    constructor(props) {
        super(props);

        this.state = {
            posts: []
        };
    }

    loadPosts() {
        fetch("https://jsonplaceholder.typicode.com/posts")
            .then(response => response.json())
            .then(data => {
                const posts = data.map(
                    post => new Post(post.id, post.title, post.body)
                );

                this.setState({
                    posts: posts
                });
            })
            .catch(error => {
                console.error(error);
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        alert(error);
        console.error(info);
    }

    render() {
        return (
            <div style={{ padding: "20px" }}>
                <h1>Blog Posts</h1>

                {
                    this.state.posts.map(post => (
                        <div key={post.id}>
                            <h3>{post.title}</h3>
                            <p>{post.body}</p>
                            <hr />
                        </div>
                    ))
                }

            </div>
        );
    }
}

export default Posts;
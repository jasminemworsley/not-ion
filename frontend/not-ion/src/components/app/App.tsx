import React from 'react';

function Welcome(props: { name: React.ReactNode; }) {
    return <h1>Hello, {props.name}</h1>;
}

function App() {
  return (
      <div>
          <Welcome name="Conor" />
          <Welcome name="Jasmine" />
      </div>
  );
}

export default App;

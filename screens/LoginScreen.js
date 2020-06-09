import * as React from 'react';
import {Button, StyleSheet, TextInput, View} from 'react-native';

const LoginScreen = ({navigation}) => {

  const [data, setData] = React.useState({
    username: '',
    password: '',
  });

  function handleUsernameChange(username) {
    setData({
      ...data,
      username,
    });
  }

  function handlePasswordChange(password) {
    setData({
      ...data,
      password,
    })
  }

  function navigateHome() {
    setData({
      username: '',
      password: '',
    });

    navigation.navigate('Root');
  }

  return (
    <View style={styles.container}>
      <View style={[styles.container, styles.playingSpace, styles.flexContainer]}>
        <TextInput
          style={styles.input}
          onChangeText={username => handleUsernameChange(username)}
          placeholder="Username"
          placeholderTextColor="#666666"
          value={data.username}
        />
        <TextInput
          style={styles.input}
          onChangeText={password => handlePasswordChange(password)}
          placeholder="Password"
          placeholderTextColor="#666666"
          value={data.password}
        />
        <Button
          title="Login"
          style={styles.loginButton}
          onPress={navigateHome}
        />
      </View>
    </View>
  );
}

LoginScreen.navigationOptions = {
  header: null,
};

export default LoginScreen;

const styles = StyleSheet.create({
  container: {
    height: '100%',
  },
  flexContainer: {
    flexDirection: 'column',
    justifyContent: 'center',
    alignItems: 'center',
    direction: 'inherit',
    flexWrap: 'nowrap',
  },
  playingSpace: {
    backgroundColor: 'white',
    borderColor: 'blue',
    borderWidth: 3,
  },
  controlSpace: {
    flexDirection: 'row',
    flexWrap: 'wrap',
    backgroundColor: '#F5F5F5',
  },
  input: {
    height: 40,
    width: '80%',
    marginBottom: 10,
    borderColor: 'gray',
    borderWidth: 1,
  },
  buttonView: {
    width: '50%',
    padding: 10,
  },
  text: {
    textAlign: 'center'
  },
  loginButton: {
    width: 100,
  },
});
